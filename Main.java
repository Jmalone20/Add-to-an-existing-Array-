class Main {
  public static void main(String[] args){
    String [] arr1 = new String [12];
    String [] arr2 = {"Jasmine", "Lucile", "Sam", "Dennis", "Nour", "Thomas", "Mike", "Jean", "Erica", "Rachel"};
    arr1[0] = "Josh";
    arr1[1] = arr2[1];
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    
  for(int index = 2; index < arr2.length; index++){
    arr1[index] = arr2[index];
    System.out.println(arr1[index]);}  
  arr1[10] = "Katie";
  arr1[11] = "Luke";
  System.out.println(arr1[10]);
  System.out.println(arr1[11]);
  }
}