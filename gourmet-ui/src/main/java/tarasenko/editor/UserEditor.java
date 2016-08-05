package tarasenko.editor;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.event.ShortcutAction;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tarasenko.UserService;
import tarasenko.entity.User;

/**
 * @author tarasenko
 * @since 28.07.2016
 */
@SpringComponent
@UIScope
public class UserEditor extends VerticalLayout {
    @Autowired
    private UserService userService;

    private User user;

    TextField firstName = new TextField("First name");
    TextField lastName = new TextField("Last name");

    /* Action buttons */
    Button save = new Button("Save", FontAwesome.SAVE);
    Button cancel = new Button("Cancel");
    Button delete = new Button("Delete", FontAwesome.TRASH_O);
    CssLayout actions = new CssLayout(save, cancel, delete);

    public UserEditor() {

        addComponents(firstName, lastName, actions);

        // Configure and style components
        setSpacing(true);
        actions.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        // wire action buttons to save, delete and reset
        save.addClickListener(e -> userService.saveUser(user));
        delete.addClickListener(e -> userService.deleteUser(user));
        cancel.addClickListener(e -> edit(user));
        setVisible(false);
    }

    public interface ChangeHandler {
        void onChange();
    }

    public final void edit(User editableUser) {
        final boolean persisted = StringUtils.isNotBlank(editableUser.getId());
        if (persisted) {
            // Find fresh entity for editing
            user = userService.getUser(editableUser.getId());
        }
        else {
            user = editableUser;
        }
        cancel.setVisible(persisted);

        // Bind customer properties to similarly named fields
        // Could also use annotation or "manual binding" or programmatically
        // moving values from fields to entities before saving
        BeanFieldGroup.bindFieldsUnbuffered(user, this);

        setVisible(true);

        // A hack to ensure the whole form is visible
        save.focus();
        // Select all text in firstName field automatically
        firstName.selectAll();
    }

    public void setChangeHandler(ChangeHandler h) {
        // ChangeHandler is notified when either save or delete
        // is clicked
        save.addClickListener(e -> h.onChange());
        delete.addClickListener(e -> h.onChange());
    }
}
