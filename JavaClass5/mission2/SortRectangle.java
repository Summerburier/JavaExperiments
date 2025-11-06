public class SortRectangle {
    public static Rectangle[] sortByArea(Rectangle[] rectangles) {
        for(int i = 0; i < rectangles.length; i++){
            for(int j = i + 1; j < rectangles.length; j++){
                if(rectangles[i].area() > rectangles[j].area()){
                    Rectangle temp = rectangles[i];
                    rectangles[i] = rectangles[j];
                    rectangles[j] = temp;
                }
            }
        }
        return rectangles;

        
    }
    

}
