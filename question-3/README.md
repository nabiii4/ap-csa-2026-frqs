
public int moreHistoryThanMathAbsences() {
    int total = 0; 

      for (int i = 0; i < historyList.size(); i++) {
        CourseRecord historyStudent = historyList.get(i);
        String iD = historyStudent.getS tudentID();
        int absenses = historyStudent.getAbsences();

        
        boolean foundInMath=false;
        int mathAbsences = 0; //store those absences if it's found

        for (int i=0; i<mathList.size(); i++) {
            CourseRecord mathStudent = mathList.get(i);
            String mathiD = mathStudent.getStudentID();

            //to findf IDs match
            if (iD.equals(mathiD)) {
                foundInMath =true;
                mathAbsences=mathStudent.getAbsences();
            }
        }

        
        if(foundInMath){//if the foundis truee
            if (absenses>mathAbsences) {
                total =total+ 1;
            }
        }
    }
    return total;
}


