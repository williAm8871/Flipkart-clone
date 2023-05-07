import java.util.LinkedHashSet;

class remove{
    public static String removeduplicate(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i =0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : set){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String  str = "geeksss";
        System.out.println(removeduplicate(str));

    }
}