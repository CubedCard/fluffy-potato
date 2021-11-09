import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private httpClient: HttpClient) { }

  fetch(id: number) {
    if (id == -1) console.log("fetch all");
    else console.log("fetching one...");
    setTimeout(() => console.log("[]"), 1200);
  }

  restGetAllContainers(): Observable<any> {
    return this.httpClient.get('http://localhost:8080/containers');
  }
}
