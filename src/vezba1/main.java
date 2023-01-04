package vezba1;

import java.io.IOException;

public class main {
public static void main(String[] args) throws IOException {
	Datoteka d=new Datoteka ("file.txt");
	d.zapishi("Tekst");
	d.prochitaj();
	
}
}
