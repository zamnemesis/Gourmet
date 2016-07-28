package tarasenko;

import tarasenko.entity.Cuisine;
import tarasenko.entity.Preference;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
public interface PreferenceDAO {
    Preference findById(String id);

    void savePreference(Preference preference);

    void updatePreference(Preference preference);

    void deletePreference(Preference preference);

    List<Preference> findAllPreferences();
}
