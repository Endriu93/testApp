import { Directive, ElementRef, Input, SimpleChanges } from '@angular/core';

@Directive({
    selector: '[jhiAwdir]'
})
export class AwdirDirective {
    constructor(private el: ElementRef) {
        el.nativeElement.innerText = this.jhiAwText;
    }

    @Input()
    jhiAwText: string;

    @Input('jhiBackground')
    jhiBackground(color) {
        this.el.nativeElement.style.backgroundColor = color;
    }

    ngOnChanges(changes: SimpleChanges) {
        if (changes['jhiAwText']) {
            this.el.nativeElement.innerText = changes['jhiAwText'].currentValue;
        }
    }
}
