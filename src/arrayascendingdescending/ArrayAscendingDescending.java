
package arrayascendingdescending;


public class ArrayAscendingDescending {


    public static void main(String[] args) {
//************************************************
// NAMU DARBAI 
//************************************************
//kaip atspausdinti visus elementus didejimo / mazejimo tvarka?

        int[] masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        
        int temp = 0;
        
        System.out.println();
        System.out.println("Originalus sarasas: ");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
//////        surusiuoti DIDEJIMO tvarka

        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i+1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas [j]) {
                temp = masyvas[i];
                masyvas[i] = masyvas[j];
                masyvas[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Surusiuotas sarasas didejimo tvarka: ");
        for (int i = 0; i <masyvas.length; i++) {     
            System.out.print(masyvas[i] + " ");    
        }  

//////        surusiuoti MAZEJIMO tvarka

        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i+1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas [j]) {
                temp = masyvas[i];
                masyvas[i] = masyvas[j];
                masyvas[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Surusiuotas sarasas mazejimo tvarka: ");
        for (int i = 0; i <masyvas.length; i++) {     
            System.out.print(masyvas[i] + " "); 
            
        }  
        System.out.println();
        System.out.println();
    }
    
}
