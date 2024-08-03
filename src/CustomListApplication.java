package src;


public class CustomListApplication {
    public static <T> void main(String[] args) {


        CustomList<String> myCustomList = new CustomArrayList<>();
        myCustomList.add("element 1");
        myCustomList.add("element 2");
        myCustomList.add("element 3");
        myCustomList.add("element 4");
        myCustomList.add("element 5");
        myCustomList.add("element 6");
        myCustomList.add("element 7");
        myCustomList.add("element 8");
        myCustomList.add("element 9");
        myCustomList.add("element 10");
        myCustomList.add("element 11");
        myCustomList.add("element 12");


       //For Testing Purposes

        for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i));
        }

        System.out.println(myCustomList.getSize());
        System.out.println(myCustomList.get(5));



    }

}
