package service;

import com.t1708e.entity.Information;
import com.t1708e.util.HibernateUtil;
import org.hibernate.Session;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PhoneService {
    private static Logger LOGGER = Logger.getLogger(PhoneService.class.getSimpleName());

    public boolean saveorUpdate(Information information){
        LOGGER.log(Level.INFO, String.format("Try to save student with id %s", information.getId()));
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.saveOrUpdate(information);
            session.getTransaction().commit();
            LOGGER.log(Level.INFO, String.format("Save success!"));
            return true;
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, String.format("Error when save student with id %s", information.getId()), ex);
        }
        return false;
    }
}
