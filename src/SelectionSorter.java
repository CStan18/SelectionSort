import java.util.ArrayList;

public class SelectionSorter {
    public ArrayList<Student> sortByRollNo(ArrayList<Student> students)
    {
        for (int i = 0; i < students.size(); ++i)
        {
            int indexSmallest = i;

            for (int j = i + 1; j < students.size(); ++j)
            {
                if (students.get(j).rollno < students.get(indexSmallest).rollno)
                {
                    indexSmallest = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, students.get(indexSmallest));
            students.set(indexSmallest, temp);
        }
        return students;
    }

    public ArrayList<Student> sortByRollName(ArrayList<Student> students)
    {
        for (int i = 0; i < students.size(); ++i)
        {
            int indexSmallest = i;

            for (int j = i + 1; j < students.size(); ++j)
            {
                if ((students.get(j).name.compareTo(students.get(indexSmallest).name)) < 0)
                {
                    indexSmallest = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, students.get(indexSmallest));
            students.set(indexSmallest, temp);
        }
        return students;
    }
}
