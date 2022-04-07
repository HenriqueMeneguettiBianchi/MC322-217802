package pt.c02oo.s02classe.s03lombriga;


public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      for (int l = 0; l < lombrigas.length; l++)
        System.out.println(lombrigas[l]);
      
      tk.gravaPasso("=====");
      tk.gravaPasso("##O@@@##");
      tk.gravaPasso("#O@@@###");
      tk.gravaPasso("#O@@@@##");
      tk.gravaPasso("O@@@@###");
      tk.gravaPasso("@@@@O###");
      tk.gravaPasso("#@@@@O##");
      
      tk.stop();
      
		/*
		 * AquarioLombriga lomb1 = new AquarioLombriga(4,3,8); lomb1.apresenta();
		 * lomb1.mover(); lomb1.apresenta(); lomb1.crescer(); lomb1.apresenta();
		 * lomb1.mover(); lomb1.apresenta(); lomb1.virar(); lomb1.apresenta();
		 * lomb1.mover(); lomb1.apresenta();
		 */
	  
	  AquarioLombriga lomb2 = new AquarioLombriga(2,1,7);
	  lomb2.apresenta();
	  lomb2.mover();
	  lomb2.apresenta();
	  lomb2.crescer();
	  lomb2.apresenta();
	  lomb2.mover();
	  lomb2.apresenta();
	  lomb2.mover();
	  lomb2.apresenta();
	  lomb2.virar();
	  lomb2.apresenta();
	  
	   //lomb1.virar();
		/*
		 * lomb1.apresenta(); System.out.println("Moveu"); lomb1.mover();
		 * lomb1.apresenta(); System.out.println("Moveu"); lomb1.mover();
		 * lomb1.apresenta(); System.out.println("Virou"); lomb1.virar();
		 * lomb1.apresenta(); System.out.println("Cresceu"); lomb1.crescer();
		 * lomb1.apresenta(); System.out.println("Virou"); lomb1.virar();
		 * lomb1.apresenta(); System.out.println("Cresceu"); lomb1.crescer();
		 * lomb1.apresenta(); System.out.println("Cresceu"); lomb1.crescer();
		 * lomb1.apresenta(); System.out.println("Cresceu"); lomb1.crescer();
		 * lomb1.apresenta();
		 */
	   //lomb1.mover();
	   //lomb1.apresenta();
   }

}
