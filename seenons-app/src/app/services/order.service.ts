import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Container} from "../models/container";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  containers: Container[];

  constructor(private httpClient: HttpClient) {
    this.containers = [];
    this.restGetAllContainers().subscribe((containers) => {
      this.containers.push(...containers);
    })
  }

  findById(id: number): Container | null {
    for (let i = 0; i < this.containers.length; i++) {
      if (this.containers[i].id == id) return this.containers[i];
    }
    return null;
  }

  fetchData(id: number) {
    let containerWasFound = this.findById(id) != null;
    if (containerWasFound) this.restGetContainerById(id).subscribe((response) => {
    }, (error) => {
      console.log(error);
    });
    else console.log("invalid id");
  }

  restGetAllContainers(): Observable<Container[]> {
    return this.httpClient.get<Container[]>('http://localhost:8084/containers').pipe(map(content => {
      return content;
    }));
  }

  restGetContainerById(id: number): Observable<Container> {
    return this.httpClient.get<Container>('http://localhost:8084/containers/' + id).pipe(map(content => {
      return content;
    }));
  }
}
