public class Constructor {
        String x;
        Constructor(){
            x = "Python";
            System.out.println("Java");
        }

        Constructor(String name1){
            System.out.println(name1);
        }

        Constructor(String name2,int y){
            System.out.println(name2);
        }

        public static void main(String[] args) {
            Constructor obj = new Constructor();
            System.out.println(obj.x);
            Constructor obj1 = new Constructor("C");
            Constructor obj2 = new Constructor("Kotlin",2);
        }
}
