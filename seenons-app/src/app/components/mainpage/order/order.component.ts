import { Component, OnInit } from '@angular/core';
import {OrderService} from "../../../services/order.service";
import {Container} from "../../../models/container";

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  containers: Container[];

  constructor(private service: OrderService) {
    this.containers = this.service.containers;
  }

  ngOnInit(): void {
  }

  fetchById(id: number) {
    this.service.fetchData(id)
  }
}
