package arrayList;

import java.util.Arrays;

public class ArrayList {
    private int size = 0;
    private Object[] elementData;

    public ArrayList (){
        elementData = new Object[1];
    }


    public boolean add(Object element) {
        resize();
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean remove(int number) {
        elementData[number] = null;

        for(int i = number; i <= (elementData.length-2); i++){

            elementData[i] = elementData[i+1];
        }
        elementData[elementData.length-1] = null;
        size --;
        resize();
        return true;
    }

    public Object get(int number) {
        return elementData[number];
    }

    public boolean set(int number,Object element) {
        elementData[number] = element;

        return true;
    }

    public void resize(){
        int length = elementData.length;

        if(size >= (length-1)) {
            this.elementData = Arrays.copyOf(elementData, length * 2);
        }
        else if(size <= (length-1)/2){
            this.elementData = Arrays.copyOf(elementData, length / 2);
        }
    }

    public int size(){
        return size;
    }

    public int arraySize(){
        return elementData.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean clear(){
        size = 0;
        resize();
        Arrays.fill(elementData,null);


        return true;
    }


}

