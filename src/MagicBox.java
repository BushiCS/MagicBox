import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int maxItemCount;
    protected int itemCount;
    protected Random random = new Random();

    public MagicBox(int maxItemCount) {
        items = (T[]) new Object[maxItemCount];
        this.maxItemCount = maxItemCount;
    }

    boolean add(T item) {
        for (int i = 0; i < maxItemCount; i++) {
            if (items[i] == null) {
                items[i] = item;
                itemCount++;
                return true;
            }
        }
        System.out.println("Коробка полна");
        return false;
    }

    T pick() {
        int randomInt;
        if (maxItemCount > itemCount) {
            throw new RuntimeException("Коробка не полна, осталось заполнить ячеек: " + (maxItemCount - itemCount));
        } else {
            randomInt = random.nextInt(maxItemCount);
            return items[randomInt];
        }
    }
}
