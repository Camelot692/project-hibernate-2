package org.camelot692.dao;

import org.camelot692.domain.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO( SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
