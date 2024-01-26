import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
		String image = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(image);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, Runigram.grayScaled(sourceImage), n);
	}
}
