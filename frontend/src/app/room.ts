export class Room {
  id?: number;
  name?: string;
  date?: string;
  startHour?: string;
  endHour?: string;
  active?: boolean;

  constructor(
    id: number = 0,
    name: string = '',
    date: string = '',
    startHour: string = '',
    endHour: string = '',
    active: boolean = true
  ) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.startHour = startHour;
    this.endHour = endHour;
    this.active = active;
  }
}
