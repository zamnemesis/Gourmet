package tarasenko.controller;

import com.vaadin.annotations.Theme;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;
import tarasenko.UserService;
import tarasenko.editor.UserEditor;
import tarasenko.entity.User;

/**
 * @author tarasenko
 * @since 28.07.2016
 */
@SpringUI
@Theme("valo")
public class VaadinUI extends UI {

    @Autowired
    private UserService userService;

    private UserEditor editor = new UserEditor();

    private Grid grid = new Grid();

    private TextField filter = new TextField();

    private Button addNewBtn = new Button("New user", FontAwesome.PLUS);

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Button("Click me", e-> Notification.show("Hello Spring+Vaadin user!")));
        HorizontalLayout actions = new HorizontalLayout(filter, addNewBtn);
        VerticalLayout mainLayout = new VerticalLayout(actions, grid, editor);
        setContent(mainLayout);

        // Configure layouts and components
        actions.setSpacing(true);
        mainLayout.setMargin(true);
        mainLayout.setSpacing(true);

        grid.setHeight(300, Unit.PIXELS);
//        grid.setColumns("id", "firstName", "lastName");

        filter.setInputPrompt("Filter by last name");

        // Hook logic to components

        // Replace listing with filtered content when user changes filter
        filter.addTextChangeListener(e -> userService.getUsers());

        // Connect selected Customer to editor or hide if none is selected
        grid.addSelectionListener(e -> {
            if (e.getSelected().isEmpty()) {
                editor.setVisible(false);
            }
            else {
                editor.edit((User) grid.getSelectedRow());
            }
        });

        // Instantiate and edit new Customer the new button is clicked
        addNewBtn.addClickListener(e -> editor.edit(new User()));

        // Listen changes made by the editor, refresh data from backend
        editor.setChangeHandler(() -> {
            editor.setVisible(false);
        });

        // Initialize listing
//        listCustomers(null);
    }

//    @Autowired
//    public VaadinUI(UserEditor editor) {
//        this.editor = editor;
//        this.grid = new Grid();
//        this.filter = new TextField();
//        this.addNewBtn = new Button("New user", FontAwesome.PLUS);
//    }
}
