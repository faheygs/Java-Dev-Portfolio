package a08;
/*
 * Gavin Fahey
 * CSIS 1410 Assignment A08
 * 4/17/2017
 */
import javax.swing.ImageIcon;

public enum RockPaperScissors {

    ROCK(new ImageIcon(RockPaperScissors.class.getResource("images/rock.png"))),

    PAPER(new ImageIcon(RockPaperScissors.class.getResource("images/paper.png"))),

    SCISSORS(new ImageIcon(RockPaperScissors.class.getResource("images/scissors.png")));

    private ImageIcon image;

    private RockPaperScissors(ImageIcon image) {
	setImage(image);
    }

    public void setImage(ImageIcon icon) {
	    this.image = icon;
	}

    public ImageIcon getImage() {
	    return image;
	}

    public static RockPaperScissors getRandom() {
	    return RockPaperScissors.class.getEnumConstants()[(new java.util.Random()).nextInt(3)];
	}

    public int evaluate(RockPaperScissors arg0) {
	    if (this.equals(arg0)) {
	    	return 0;
	    } else {
		if (this.equals(ROCK)) {
		    if (arg0.equals(PAPER)) {
		    	return -1;
		    } else if (arg0.equals(SCISSORS)) {
		    	return 1;
		    }
		}
		if (this.equals(SCISSORS)) {
		    if (arg0.equals(ROCK)) {
		    	return -1;
		    }
		    if (arg0.equals(PAPER)) {
		    	return 1;
		    }
		}
		if (this.equals(PAPER)) {
		    if (arg0.equals(SCISSORS)) {
		    	return -1;
		    }
		    if (arg0.equals(ROCK)) {
		    	return 1;
		    }
		}
	}
	    return 0;
	}
}