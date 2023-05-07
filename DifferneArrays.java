import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferneArrays {
    public static void main(String argu[]) {
        int nums1[] = { 1, 2, 3, 4 };
        int nums2[] = { 1, 8, 2, 2 };
        List<List<Integer>> ans = findDifference(nums1, nums2);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (Integer i : nums1) {
            s1.add(i);
        }

        for (Integer i : nums2) {
            s2.add(i);
            s1.remove(i);
        }

        for (Integer i : nums1) {
            s2.remove(i);
        }

        List<Integer> T1 = new ArrayList<>(s1);
        List<Integer> T2 = new ArrayList<>(s2);

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(T1);
        ans.add(T2);

        return ans;
    }
}
