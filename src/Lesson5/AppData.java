package Lesson5;

public class AppData {

        private String name;
        private String role;
        private String salary;




        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public String getSalary() {
            return salary;
        }
        public void setSalary(String salary) {
            this.salary = salary;
        }

        @Override
        public String toString(){
            return "\nName " + getName() + "::WORK= " + getRole() + "::SALARY= " + getSalary();
        }
    }


