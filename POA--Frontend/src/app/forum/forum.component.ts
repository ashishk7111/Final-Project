import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forum',
  templateUrl: './forum.component.html',
  styleUrls: ['./forum.component.css']
})
export class ForumComponent implements OnInit {


 title = 'forum';
  commentText: string = "";
  commentList: any = [];
  iscommentListEmpty = false;
  constructor() { }

  ngOnInit(): void {
    this.iscommentListEmpty = true;
  }
  onAddcommentText() {
    if (this.commentText != "") {
      console.log("adding the commentText - ", this.commentText);
      let commentObj = { commentId: this.commentList.length, text: this.commentText, isCompleted: false, buttonText: "Like" };

      this.commentList.push(commentObj);
      this.commentText = "";
      this.iscommentListEmpty = false;
    }
  }

  onClearcommentText() {
    console.log("clearing the todoList - ", this.commentList);
    this.commentList = [];
    this.commentText = "";
    this.iscommentListEmpty = true;
  }

  onCompletingTask(commentId: number) {
    if (this.commentList[commentId].isCompleted) {
      this.commentList[commentId].isCompleted = false;
      this.commentList[commentId].buttonText = "Like";
    } else {
      this.commentList[commentId].isCompleted = true;
      this.commentList[commentId].buttonText = "Dislike";
    }
  }

}
