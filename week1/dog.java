public class dog{
        private static int count = 0;

        public dog() {
                count++;
                }

        public static void main(String[] args){
                dog num1 = new dog();
                dog num2 = new dog();
                System.out.println(count);
                }


}
