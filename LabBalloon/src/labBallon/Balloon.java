package labBallon;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Balloon {
	private final String type;
	private final Size size;
	
	public Balloon(String type, Size size) {
		this.type = type;
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (size != other.size)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return type + " " + size;
	}
	
	public Icon getIcon() { // makes code easier to use for client
		return size.getIcon();
	}

	public enum Size { 
		XS(new ImageIcon(Size.class.getResource("images/balloon20.jpg"))), 
		S(new ImageIcon(Size.class.getResource("images/balloon40.jpg"))),
		M(new ImageIcon(Size.class.getResource("images/balloon60.jpg"))),
		L(new ImageIcon(Size.class.getResource("images/balloon80.jpg"))),
		XL(new ImageIcon(Size.class.getResource("images/balloon100.jpg")));
		
		private Icon icon;

		private Size(Icon icon) {
			this.icon = icon;
		}

		public Icon getIcon() {
			return icon;
		}
	}
}
