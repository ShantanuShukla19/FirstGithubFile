package DA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Handler;

public class PatientAdmissionSystem {
    public static class patientadmission{
        String patient_name;
        patientadmission(String x){
            patient_name=x;
        }

        @Override
        public String toString() {
            return "PATIENT NAME IS : "+patient_name;
        }
    }
    private Queue<patientadmission> add_patient;
    private Queue<patientadmission> discharge_patient;
    public  PatientAdmissionSystem(){
        this.add_patient=new LinkedList<>();
        this.discharge_patient=new LinkedList<>();
    }
    public void patientadd(patientadmission patient){
        this.add_patient.add(patient);
    }
    public void patientdischarged(patientadmission patient){
        if(add_patient.isEmpty()){
            throw new UnsupportedOperationException("QUEUE IS EMPTY");
        }
        add_patient.remove(patient);
        discharge_patient.add(patient);
    }
    public void searching(patientadmission patient){
        boolean flag=false;
        for (patientadmission patient1:add_patient){
            if(patient1.equals(patient)) {
                flag=true;
                break;
            }
        }
        if (flag==true){
            System.out.println("PATIENT IS IN THE HOSPITAL");
        }
        else {
            System.out.println("PATIENT IS NOT IN THE HOSPITAL");
        }
    }
    public void display(){
        System.out.println("------------------------------------------------");
        System.out.println("Hospital Statuses:");
        System.out.println("------------------------------------------------");
        if(!add_patient.isEmpty()){
            System.out.println("PATIENTS IN THE HOSPITAL");
            for (patientadmission add_patient:add_patient ){
                System.out.println(add_patient.toString());
            }
            System.out.println();
        }
        if(!discharge_patient.isEmpty()){
            System.out.println("PATIENTS DISCHARGED FROM THE HOSPITAL");
            for (patientadmission dischargepatient:discharge_patient){
                System.out.println(dischargepatient.toString());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patientadmission patient1=new patientadmission("patient1");
        patientadmission patient2=new patientadmission("patient2");
        patientadmission patient3=new patientadmission("patient3");
        PatientAdmissionSystem hospital=new PatientAdmissionSystem();
        hospital.patientadd(patient1);
        hospital.patientadd(patient2);
        hospital.patientadd(patient3);
        hospital.patientdischarged(patient3);
        hospital.searching(patient3);
        hospital.display();
    }
}
