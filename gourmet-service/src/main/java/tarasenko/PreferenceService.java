package tarasenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarasenko.entity.Preference;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Service
public class PreferenceService {
    @Autowired
    private PreferenceDAO preferenceDAO;

    public Preference getPreferenceById(String id) {
        return preferenceDAO.findById(id);
    }

    public List<Preference> getPreferences() {
        return preferenceDAO.findAllPreferences();
    }
}
