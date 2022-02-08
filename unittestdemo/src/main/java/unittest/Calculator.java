package unittest;
 public class Calculator {
        public int add(int a, int b){
            int result = a + b;
            return result;
        }
        public int sub(int a, int b){
            int resutl = a - b;
            return resutl;
        }

        public int testNotNull(int a){
            return a;
        }

        public String testNull(String s){
            return s;
        }
}
