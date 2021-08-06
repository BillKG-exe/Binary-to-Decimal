import java.util.LinkedList;

public class BinQueue{
    private LinkedList<Character> queue = new LinkedList<>();
    private int power = 0;

    BinQueue(String str) {
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) != ' '){
                queue.addLast(str.charAt(index));
                power++;
            }
        }
    }

    public int dequeue() {
        Character val = queue.removeFirst();
        if(val == ' '){
            return 0;
        }
        else{
            power--;
            return Character.getNumericValue(val);
        }
    }

    @Override
    public String toString() {
        String str = "";
        while(queue.size() > 0)
            str += queue.remove();
        return str;
    }

    public int power() {
        return power;
    }
}
