package cats;
import java.util.*;
import javax.swing.JOptionPane;

public class Sorter {

	public static void main(String[] args) {
		int l1 = 0;
		int l2 = 0;
		int l3 = 0;
		int l4 = 0;
		int l5 = 0;
		int l6 = 0;
		int l7 = 0;
		int l8 = 0;
		int l9 = 0;
		int l10 = 0;
		l1 = (int) (Math.random() * 100);
		l2 = (int) (Math.random() * 100);
		l3 = (int) (Math.random() * 100);
		l4 = (int) (Math.random() * 100);
		l5 = (int) (Math.random() * 100);
		l6 = (int) (Math.random() * 100);
		l7 = (int) (Math.random() * 100);
		l8 = (int) (Math.random() * 100);
		l9 = (int) (Math.random() * 100);
		l10 = (int) (Math.random() * 100);
		int[] list =  {l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
		JOptionPane.showConfirmDialog(null, Arrays.toString(list));
		JOptionPane.showConfirmDialog(null, Arrays.toString(bubbleSort(list)));
	}
	public static int[] bubbleSort(int[] list)
	// Per: array is full, all elements are valid integers (not null)
	// post: array is sorted in ascending order (lowest to highest)
	{
		boolean swappedOnPrevRun = true;
		while(swappedOnPrevRun)
		{
			swappedOnPrevRun = false;			// this variable keeps track of whether to continue sorting or exit
			for(int i = 0; i < list.length - 1; i++)	// loop through every element in the array,
									// except for the last one
			{
				if(list[i] > list[i + 1])		// if current element is greater than the next
				{
					// swap the two elements
					swappedOnPrevRun = true;	// we don't want the loop to end just yet, we're not done
					int temp = list[i];		// store element i in a temporary variable
					list[i] = list[i + 1];	// set element i+1 to where i used to be
					list[i + 1] = temp;		// release the old i from temp into i+1 slot
				}
			}
		}
		return list;
}
}
