package webpatterns.dao.library.models.daos;

public abstract class DaoFactory {

	public static DaoFactory factory = null;

	public static void setFactory(DaoFactory factory) {
		DaoFactory.factory = factory;
	}

	public static DaoFactory getFactory() {
		assert factory != null;
		return factory;
	}

	public abstract AuthorDAO getAuthorDao();

	public abstract ContactDAO getContactDao();

	public abstract StyleDAO getStyleDao();

	public abstract ThemeDAO getThemeDao();

	public abstract BookDAO getBookDao();

}
