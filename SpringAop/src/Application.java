import java.util.*;

class Application {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Map<Integer, ArrayList<Integer>> universityMap = new HashMap<>();
        int univ,x,y;
        int i,j,l1,l2,ele1,ele2,k;
        for(i=0; i<n; i++) {
        	univ = sc.nextInt();
            ArrayList<Integer> positions = universityMap.get(univ);
            if(positions != null)
            	positions.add(i);
            else {
            	positions = new ArrayList<Integer>();
            	positions.add(i);
            	universityMap.put(univ, positions);
            }
        }
        while (q-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            List<Integer> list1 = universityMap.get(x);
            List<Integer> list2 = universityMap.get(y);
            l1 = list1.size();
            l2 = list2.size();
            i=0;j=0;k=0;
            int min = Integer.MAX_VALUE;
            int diff = 0;
            while(i<l1 && j<l2) {
            	ele1 = list1.get(i);
            	ele2 = list2.get(j);
            	diff = Math.abs(ele1 - ele2);
            	min = diff < min ? diff : min;
            	if(ele1 < ele2) {
            		i++;
            	} else {
            		j++;
            	}
            }
            diff = Math.min(Math.abs(list1.get(l1-1) - n - list2.get(0)), Math.abs(list2.get(l2-1) - n - list1.get(0)));
            min = diff < min ? diff : min;
            System.out.println(min/2);
        }
    }
}
