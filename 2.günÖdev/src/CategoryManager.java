
public class CategoryManager {
	public void add(Category category) {

		System.out.println(category.getName() + "Kategori eklendi");
	}

	public void remove(Category category) {

		System.out.println(category.getName() + " Kategori silindi.");
	}

	public void update(Category category) {

		System.out.println(category.getName() + " Kategori güncellendi.");
	}

}
