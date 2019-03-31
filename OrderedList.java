public class OrderedList{
    //fields
    private static final int INITIAL_CAPACITY = 10;
    private List_inArraySlots refList;
    // private List_inArraySlots ordList;
    // private int filledElements;


    //constructors
    public OrderedList(){
        refList = new List_inArraySlots();
        // ordList = new List_inArraySlots(INITIAL_CAPACITY);
    }


    //methods
    public int size() {
        return refList.size();
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        return refList.toString();
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {

        if(refList.size() == 0) {refList.add(value);

        } else {
            int index = 0;
            for (index = 0; index < refList.size() && value >= refList.get(index); index++) {}
            refList.add(index, value);
        }

         // // expand if necessary
         // if( filledElements == elements.length) expand();
         //
         // elements[ filledElements] = value;
         // filledElements++;
         // // idiomatic version: elements[ filledElements++] = value;
        return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     // private void expand() {
     //    System.out.println( "expand... (for debugging)");
     //       /* S.O.P. rules for debugging:
     //          Working methods should be silent. But during
     //          development, the programmer must verify that
     //          this method is called when that is appropriate.
     //          So test using the println(), then comment it out.
     //          */
     //    int[] bigger = new int[ elements.length * 2];
     //    for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
     //        bigger[ elemIndex] = elements[ elemIndex];
     //    elements = bigger;
     // }

    // --------- end of "code that worked in v0" ---------


    // accessors
    /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
        // E-Z! pass through the request to the array object
        return refList.get(index);
    }


    // /**
    //   Set value at @index to @newValue
    //
    //   @return old value at @index
    //   @precondition: @index is within the bounds of this list.
    //  */
    // public int set( int index, int newValue ) {
    //     int saveForReturn = get( index);
    //     elements[ index] = newValue;
    //     return saveForReturn;
    // }
    //
    //
    // /**
    //   Insert @value at position @index in this list.
    //
    //   Shift the element currently at that position (if any)
    //   and any subsequent elements to the right
    //   (that is, increase the index associated with each).
    //  */
    // public void add( int index, int value) {
    //     if( index == filledElements) // adding at end of list
    //         add( value);
    //     else {// need space
    //          // open up space, expanding if necessary
    //          add( elements[ filledElements-1]);
    //
    //          // move the hole left / shift "subsequent elements" right
    //          for( int hole = filledElements-1; hole > index; hole--)
    //              elements[ hole] = elements[ hole-1];
    //
    //         elements[ index] = value; // store new value
    //     }
    // }


     /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public int remove( int index) {
        // int result = refList.get(index);  // save for returning
        //
        // for( int put = index; put < refList.size()-1; put++)
        //      elements[ put] = elements[ put+1];
        //      refList.set(put, refList.get(put+1));
        //
        // refList.filledElements--;
        // return result;
        return refList.remove(index);
    }
}
