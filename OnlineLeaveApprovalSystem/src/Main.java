
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    BaseLeaveApprover director = new Director();
    BaseLeaveApprover principal = new Principal(director);
    BaseLeaveApprover hod = new HeadOfDepartment(principal);

    hod.approveLeave(10);

}
