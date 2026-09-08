public class RansomeNote {

    public boolean ransomeNote(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for (char r : ransomNote.toCharArray()) {
            arr[r - 'a']++;
        }

        for (char r : magazine.toCharArray()) {
            arr[r - 'a']--;
        }

        for (int i : arr) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomeNote obj1 = new RansomeNote();

        String ransomNote = "aa";

        String magazine = "ab";

        boolean res = obj1.ransomeNote(ransomNote, magazine);
        System.out.println(res);
    }
}
