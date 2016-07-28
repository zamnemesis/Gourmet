package tarasenko.impl;

import org.springframework.stereotype.Repository;
import tarasenko.AbstractDAO;
import tarasenko.PreferenceDAO;
import tarasenko.entity.Cuisine;
import tarasenko.entity.Preference;

import java.util.List;

/**
 * @author tarasenko
 * @since 22.07.2016
 */
@Repository
public class PreferenceDAOImpl extends AbstractDAO<String, Preference> implements PreferenceDAO{
    @Override
    public Preference findById(String id) {
        return getByKey(id);
    }

    @Override
    public void savePreference(Preference preference) {
        persist(preference);
    }

    @Override
    public void updatePreference(Preference preference) {

    }

    @Override
    public void deletePreference(Preference preference) {

    }

    @Override
    public List<Preference> findAllPreferences() {
        return findAll();
    }
}
