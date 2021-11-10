import {Type} from "./type";

export class Container {
  id: number;
  size: number;
  type: Type;
  images: string[];
  description: string;
  name: string;
  active: boolean;

  constructor(id: number, size: number, type: Type, images: string[], description: string, name: string, active: boolean) {
    this.id = id;
    this.size = size;
    this.type = type;
    this.images = images;
    this.description = description;
    this.name = name;
    this.active = active;
  }
}
