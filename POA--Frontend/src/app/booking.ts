export class Booking {

    bookingId: number;
    name: string;
    emailId : string;  //hidden
    turfName: string;
    managerName: string;
    turfAdd : string;    
    time : string;
    date : string;

    constructor(){
        this.bookingId=0,
        this.name="",
        this.emailId="",
        this.turfName="",
        this.managerName="",
        this.turfAdd="",
        this.time="",
        this.date=""
    }

}
