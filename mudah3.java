public class mudah3 {
    public static void main(String[] args) {
        for(int i =50; i >= 1; i--){
            System.out.println(i + ",");
            if (i == 1) {
                System.out.println("saya senang");
            }else {
                switch (i % 3) {
                    case 0:
                        System.out.println("saya angkatan 33");
                        break;
                    case 1:
                         System.out.println("saya anak moklet");
                         break;
                    case 2:
                         System.out.println("saya anak wikusama");     
                         break;    
                }
            }
        }
    }
}