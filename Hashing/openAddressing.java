package Hashing;

/**
 * OpenAdrressing with Linear probing
 */

class myClass{
    int[] arr;
    int size,cap;

    public myClass(int cap) {
        this.cap = cap;
        size=0;
        for(int i=0;i<cap;i++){
            arr[i]=-1;
        }
    }
    // hash function
    int hash(int key){
        return key%cap;
    }

    boolean insert(int key){

        if(size==cap){
            return false;
        }
        int i=hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key){
            i=(i+1)%cap;
        }
        if(arr[i]==key){
            return false;
        }
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean saerch(int key){
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                return true;
            }
            i=(i+1)%cap;
            if(i==h ){
                return false;
            }
        }
        return false;
    }
    boolean delete(int key){
        int h=hash(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
    }
}
public class openAddressing {
}
