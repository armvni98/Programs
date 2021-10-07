import java.util.Arrays;

public class Farm {
   private Animal[] animals;
   private String farmName;
   private int numAnimals;
   
   public Farm() {
      animals = new Animal[10];
      this.numAnimals = 0;
      this.farmName = "";
   }
   
   public Farm(int maxAnimals) {
      if (maxAnimals < 0) maxAnimals = 0;
      animals = new Animal[maxAnimals];
      this.numAnimals = 0;
      this.farmName = "";
   }
   
   public Farm(String farmName) {
      animals = new Animal[10];
      this.farmName = farmName;
      this.numAnimals = 0;
   }
   
   public Farm(String farmName, int maxAnimals) {
      if (maxAnimals < 0) maxAnimals = 0;
      this.farmName = farmName;
      this.numAnimals = 0;
      animals = new Animal[maxAnimals];
   }
   
   public String getFarmName() {
      return farmName;
   }
   
   public void setFarmName(String farmName) {
      this.farmName = farmName;
   }
   
   public void addAnimal(Animal a) {
      if (this.numAnimals >= animals.length) resizeAnimalArray();
      animals[numAnimals++] = a;
   }
   
   public Animal getAnimal(int index) {
      if (index < 0 || index >= numAnimals) return null;
      return animals[index];
   }
   
   public int getNumAnimals() {
      return this.numAnimals;
   }
   
   public Animal getFirstAnimal() {
      return animals[0];
   }
   
   public Animal getLastAnimal() {
      return animals[numAnimals-1];
   }
   
   public Animal[] getAnimals() {
      return this.animals;
   }
   
   public Animal removeAnimal(int index) {
      if(index<0 || index >= numAnimals) return null;
      Animal[] temp = new Animal[animals.length];
      int j=0;
      Animal a = animals[index];
      for(int i = 0; i<numAnimals; i++) {
         if(i != index)
         {
            temp[j] = animals[i];
            j++;
         }
      }
      temp[animals.length-1] = null;
      animals = temp;
      numAnimals -= 1;
      return a;
   }
   
   public void removeAllAnimals() {
      this.numAnimals = 0;
   }
   
   public double getTotalWeightOfAllAnimals() {
      double sum = 0;
      for(int i0=0;i0<numAnimals;i0++)
         sum += animals[i0].getWeight();
      return sum;
   }
   
   public double getAverageWeightOfAllAnimals() {
      return getTotalWeightOfAllAnimals() / (numAnimals);
   }
   
   public int getNumberOfAnimalsAboveWeight(double weight) {
      int i = 0;
      for(int i0=0;i0<numAnimals;i0++)
         if (animals[i0].getWeight() > weight)
            i++;
      return i;
   }
   
   public int getNumberOfAnimalsBelowWeight(double weight) {
      
      int i = 0;
      for(int i0=0;i0<numAnimals;i0++)
         if (animals[i].getWeight() < weight)
            i++;
      return i;
   }
   
   public void increaseWeightOfAllAnimals() {
      for(int i=0;i<numAnimals;i++)
         animals[i].getWeight();
   }
   
   public void increaseWeightOfAllAnimals(double weight) {
      for(int i0=0;i0<numAnimals;i0++)
         animals[i0].setWeight(weight);
   }
   
   public void printAllDetails() {
      System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n",
            this.farmName, this.numAnimals, animals.length);
      for(int i=0;i<numAnimals;i++)
         animals[i].printDetails();
   }
   
   public void resizeAnimalArray() {
      if (animals.length == 0) {
         animals = Arrays.copyOf(animals, 2);
      } else
         animals = Arrays.copyOf(animals, animals.length * 2);
   }
   
}