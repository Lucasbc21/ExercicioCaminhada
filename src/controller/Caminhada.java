package controller;

import java.util.concurrent.Semaphore;

public class Caminhada extends Thread {
       private int pessoas;
       private Semaphore semaforo;
       
       public Caminhada (int pessoas,Semaphore semaforo ) {
    	   this.pessoas = pessoas;
    	   this.semaforo = semaforo;
       }
       
       public void run() {
    	   try {
    		   semaforo.acquire();
    	   PessoasAndando();
    	   }catch(InterruptedException e1){
                 e1.getStackTrace();
    		   
    	   }finally {
    		   semaforo.release();
    	   }
       }
       
       public void PessoasAndando() {
    	//   int posicao = 0;
    	   int andou ;
    	   int ja_andou = 0;
    	   int TamanhoCorredor = 200;
    	   
    	   if(pessoas == 1) {
    		   do {
    			   andou = (int) (Math.random()* 4)+3;
    			   ja_andou += andou ;  
    			   System.out.println("A 1º pessoa "+andou+"m\t ja percorreu "+ja_andou+"m");
    			   
    			   try {
    				   Thread.sleep(1000);
    			   }catch(InterruptedException e) {
    				    e.printStackTrace();	
    				    }
    			   
    		   }while(ja_andou < TamanhoCorredor);
    		   System.out.println("A 1º pessoa terminou de andar pelo corredor e entrou pela porta");
    	   }
    	   if(pessoas == 2) {
    		   do {
    			   andou = (int) (Math.random()* 4)+3;
    			   ja_andou += andou ;  
    			   System.out.println("A 2º pessoa "+andou+"m\t ja percorreu "+ja_andou+"m");
    			   
    			   try {
    				   Thread.sleep(1000);
    			   }catch(InterruptedException e) {
    				    e.printStackTrace();	
    				    }
    			   
    		   }while(ja_andou < TamanhoCorredor);
    		   System.out.println("A 2º pessoa terminou de andar pelo corredor e entrou pela porta");
    	   }
    	   if(pessoas == 3) {
    		   do {
    			   andou = (int) (Math.random()* 4)+3;
    			   ja_andou += andou ;  
    			   System.out.println("A 3º pessoa "+andou+"m\tja percorreu "+ja_andou+"m");
    			   
    			   try {
    				   Thread.sleep(1000);
    			   }catch(InterruptedException e) {
    				    e.printStackTrace();	
    				    }
    			   
    		   }while(ja_andou < TamanhoCorredor);
    		   System.out.println("A 3º pessoa terminou de andar pelo corredor e entrou pela porta");
    	   }
    	   if(pessoas == 4) {
    		   do {
    			   andou = (int) (Math.random()* 4)+3;
    			   ja_andou += andou ;  
    			   System.out.println("A 4º pessoa "+andou+"m\t ja percorreu "+ja_andou+"m");
    			   
    			   try {
    				   Thread.sleep(1000);
    			   }catch(InterruptedException e) {
    				    e.printStackTrace();	
    				    }
    			   
    		   }while(ja_andou < TamanhoCorredor);
    		   System.out.println("A 4º pessoa terminou de andar pelo corredor e entrou pela porta");
    	   }
       }

    }



