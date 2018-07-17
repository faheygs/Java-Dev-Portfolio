package list_vs_set;
/*
 * Gavin Fahey
 * CSIS 1410
 * March 29th, 2017
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {
	private List<ColoredSquare> list;
    private Set<ColoredSquare> set;
    
    public ListVsSetDemo(ColoredSquare... elements) {
		list = new ArrayList<ColoredSquare>();
		set = new HashSet<ColoredSquare>();
	
		for (ColoredSquare el : elements)
		{
		    addElement(el);
		}
    }
    
    public String getListElements() {
	    StringBuilder string = new StringBuilder();
	    for (ColoredSquare el : list)
	    {
	    	string.append(el.toString()).append("\n");
	    }
	    return string.toString();
	}
    
    public String getSetElements() {
	    StringBuilder string = new StringBuilder();
	    for (ColoredSquare el : set)
	    {
	    	string.append(el.toString()).append("\n");
	    }
	    return string.toString();
	}
    
    public void addElement(ColoredSquare el) {
	    list.add(el);
	    set.add(el);
	}
}
