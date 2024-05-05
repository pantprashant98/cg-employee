import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl: string = 'http://localhost:8080';

  constructor(private http: HttpClient) {}

  getIndex(): Observable<string> {
      return this.http.get<string>(this.baseUrl);
  }
  
}
