import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
    selector: 'jhi-one',
    templateUrl: './one.component.html',
    styles: []
})
export class OneComponent implements OnInit {
    constructor() {}

    @Input()
    value: string;

    @Output()
    valueChange = new EventEmitter<string>();

    ngOnInit() {}

    getValue() {
        return this.value;
    }
}
