import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-get-employee',
  templateUrl: './get-employee.component.html',
  styleUrls: ['./get-employee.component.css']
})
export class GetEmployeeComponent implements OnInit {
  response: string;


  constructor(private employeeService: EmployeeService) {}

  ngOnInit() {
  }
  
  getIndex(): void {
    this.employeeService.getIndex().subscribe(
        (data: string) => {
            this.response = data;
        },
        (error) => {
            console.error(error);
        }
    );
}



}
