import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OneComponent } from './one/one.component';
import { AwdirDirective } from './awdir.directive';

@NgModule({
    declarations: [OneComponent, AwdirDirective],
    exports: [OneComponent, AwdirDirective],
    imports: [CommonModule]
})
export class TestModule {}
