import java.util.*;
enum shop{
	revive(10);
	private int price;
	shop(int p){price = p;}
	int getPrice(){return price;}
	
}
class test{
	public static void main(String[]args){
		boolean boo = true;
		int nextghost=99, go=0,opsi, ghost = 5 ,letakcoin , room=0, koin=0, key = 0, revive = 0, letakkey1, letakkey2, letakkey3, letakkey4, letakghost=99, ulang=0;
		boolean key1 = true, key2 = true, key3 = true, key4 = true, coin = true;
		String sroom="";
		readFile rf = new readFile();
		rf.openFile();
		rf.readingFile();
		koin = rf.koin;
		rf.closeFile();
		Scanner input = new Scanner(System.in);
		Random bot = new Random();
		letakkey1 = bot.nextInt(24)+1;
		letakkey2 = bot.nextInt(24)+1;
		letakkey3 = bot.nextInt(24)+1;
		letakkey4 = bot.nextInt(24)+1;
		letakcoin = bot.nextInt(24)+1;
		
		System.out.println("WELCOME TO THE UNDERGROUND DEN!!!");
		System.out.println("you are now trapped inside and you need to collect 4 keys to escape.");
		System.out.println("Good Luck!!!");
		do{
			try{
			ulang=0;
			System.out.println("Which room do you want to enter?");
			System.out.println("");
			System.out.println("forward: 1 or 2");
			System.out.println("press 99 to go to shop");
			System.out.println("");
			System.out.print("Room : ");
			sroom = input.next();
			room = Integer.parseInt(sroom);
			if(room==1 || room==2 || room==99){
				ulang=1;
			}
			else{
				System.out.println("");
				System.out.println("Sorry there's no such option");
				System.out.println("");
			}
			}catch(Exception e){
				System.out.println("");
				System.out.println("Sorry there's no such option");
				System.out.println("");
				ulang=0;
			}
			
		}while(ulang == 0);
			
		do{
			ulang =0;
			switch(room){
				case 0 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 0");
					if(letakghost==room){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						ulang =0;
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 1 or 2");
						System.out.println("press 99 to go to shop");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==1 || room==2|| room==99){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 1 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 1");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println(" ");
						System.out.println("forward: 3 or 4");
						System.out.println("back: 0");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==3 || room ==4|| room==0){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 2 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					
					System.out.println("You've entered room 2");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?"); 
						System.out.println("");
						System.out.println("forward: 5 or 6 or 7");
						System.out.println("back: 0");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==5 || room ==6||room==7 || room ==0){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 3 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					
					System.out.println("You've entered room 3");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(4);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 8 or 9 or 10");
						System.out.println("back: 1");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==8 || room==9|| room==10|| room==1){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 4 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					
					System.out.println("You've entered room 4");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 11 or 12");
						System.out.println("back: 1");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==11 || room==12|| room==1){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 5 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					
					System.out.println("You've entered room 5");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 13"); 
						System.out.println("back: 2");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==13 || room==2){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 6 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 6");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 13");
						System.out.println("back: 2");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==13 || room==2){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 7 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 7");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 13"); 
						System.out.println("back: 2");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==13 || room==2){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 8 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 8");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 14"); 
						System.out.println("back: 3");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==14 || room==3){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
					}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 9 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 9");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 14");
						System.out.println("back: 3");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==14 || room==3){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 10 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 10");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 14"); 
						System.out.println("back: 3");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==14 || room==3){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 11 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 11");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 15");
						System.out.println("back: 4");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==15 || room==4){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
						}
						
					}while(ulang == 0);
				}
				break;
				
				case 12 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 9");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 16");
						System.out.println("back: 4");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==16 || room==4){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 13 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 13");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward : 17 or 18");
						System.out.println("back : 5 or 6 or 7");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==17||room==18||room==5||room==6||room==7){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 14 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 14");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 19 or 20 or 21"); 
						System.out.println("back: 8 or 9 or 10");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==19||room==20||room==21||room==8||room==9||room==10){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 15 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 15");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 21"); 
						System.out.println("back: 11");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==21||room==11){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 16 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 16");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 21");
						System.out.println("back: 12");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==21||room==12){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 17 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 17");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 18 or 22 or 23 or 24");
						System.out.println("back: 13");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==18||room==22||room==23||room==24||room==13){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 18 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 18");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 17 or 22 or 23 or 24");
						System.out.println("back: 13");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==17||room==22||room==23||room==24||room==13){
							ulang=1;
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 19 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 19");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward : 25 ( FINAL ROOM )");
						System.out.println("back: 14");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==14||room==25){
							ulang=1;
							if(room==25&&key!=4){
								ulang=0;
								System.out.println("You don't have enough keys to enter to the final room");
								System.out.println("Keys : " + key);
							}
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}	
				break;
				
				case 20 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 20");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 25 ( FINAL ROOM )");
						System.out.println("back: 14");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==14||room==25){
							ulang=1;
							if(room==25&&key!=4){
								ulang=0;
								System.out.println("You don't have enough keys to enter to the final room");
								System.out.println("Keys : " + key);
							}
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 21 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 21");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 25 ( FINAL ROOM )");
						System.out.println("back: 14 or 15 or 16");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==14||room==15||room==16||room==25){
							ulang=1;
							if(room==25&&key!=4){
								ulang=0;
								System.out.println("You don't have enough keys to enter to the final room");
								System.out.println("Keys : " + key);
							}
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 22 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 22");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 25 ( FINAL ROOM )");
						System.out.println("back: 17 or 18");
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==17||room==18||room==25){
							ulang=1;
							if(room==25&&key!=4){
								ulang=0;
								System.out.println("You don't have enough keys to enter to the final room");
								System.out.println("Keys : " + key);
							}
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}

						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 23 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 23");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter?");
						System.out.println("");
						System.out.println("forward: 25 ( FINAL ROOM )");
						System.out.println("back:17 or 18"); 
						System.out.println("");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==17||room==18||room==25){
							ulang=1;
							if(room==25&&key!=4){
								ulang=0;
								System.out.println("You don't have enough keys to enter to the final room");
								System.out.println("Keys : " + key);
							}
						}
						else{
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 24 :
				if(nextghost==0){
					Sounds.nearby();
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){}
					System.out.println("OH NO!!! THE GHOST CURSE YOU \nGAME OVER");
					room=25;
					go=1;
				}
				if(go==0){
					System.out.println("You've entered room 24");
					if(letakcoin==room&&coin==true){
						System.out.println("You have found a coin!!!");
						koin++;
						coin=false;
					}
					if(letakkey1==room&&key1==true){
						System.out.println("You have found a key!!!");
						key++;
						key1=false;
						ghost--;
					}
					if(letakkey2==room&&key2==true){
						System.out.println("You have found a key!!!");
						key++;
						key2=false;
						ghost--;
					}
					if(letakkey3==room&&key3==true){
						System.out.println("You have found a key!!!");
						key++;
						key3=false;
						ghost--;
					}
					if(letakkey4==room&&key4==true){
						System.out.println("You have found a key!!!");
						key++;
						key4=false;
						ghost--;
					}
					letakghost = bot.nextInt(3);;
					if(letakghost==0){
						System.out.println("Someone is nearby.......");
						nextghost = bot.nextInt(ghost);
					}
					do{
						try{
						System.out.println("Which room do you want to enter? back to 17 or 18 or go to 25(final room)");
						System.out.print("Room : ");
						sroom = input.next();
						room = Integer.parseInt(sroom);
						if(room==17||room==18||room==25){
							ulang=1;
							if(room==25&&key!=4){
								ulang=0;
								System.out.println("You don't have enough keys to enter to the final room");
								System.out.println("Keys : " + key);
							}
						}
						else{
							System.out.println("Sorry there's no such option");
						}
						}catch(Exception e){
							System.out.println("");
							System.out.println("Sorry there's no such option");
							System.out.println("");
							ulang=0;
							}
					}while(ulang == 0);
				}
				break;
				
				case 99 :
				System.out.println("Welcome to Our Shop...\nWhat do you want to buy? ");
				System.out.println("Revive costs " + shop.revive.getPrice() + " coins.");
				System.out.println("Press 1 to buy revive");
				opsi = input.nextInt();
				if(opsi==1){
					if(koin<10){
					System.out.println("Not enough Coin.");
					}
					if(koin>=10){
						koin = koin-10;
						revive++;
					}
				}
				if(opsi!=1){
					do{
						ulang=0;
						System.out.println("Press 0 to back to Start");
						System.out.print("Room : ");
						room = input.nextInt();
						if(room==0){
							ulang=1;
						}
						else{
							System.out.println("Sorry there's no such option");
						}
					}while(ulang == 0);	
				}
				break;
				
				default : 
				System.out.println("There's no such option");
				break;
			}
		}while(room !=25);
		if(key==4){
			System.out.println("You reached the final room!!!");
		}
		else{
			System.out.print("HAHAHAHAHA!!!!!");
				createFile save = new createFile();
					save.openFile();
					save.addRecords(koin);
					save.closeFile();
		}
	}
}		