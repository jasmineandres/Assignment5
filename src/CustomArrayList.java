package src;

import static java.lang.System.arraycopy;

public class CustomArrayList<T> implements CustomList<T> {

    Object[] items = new Object[10];
	private int size = 0;


    @Override
    public boolean add(T item) {
        if (size >= items.length) {
			Object [] newItems = new Object[(items.length* 2)];
			arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;

		}
		items[size++] = item;


            return true;

    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    public T get(int index) {

        return (T) items[index];

    }

}
