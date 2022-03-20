import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';

import { IncidenciasRoutingModule } from './exames-routing.module';
import { ExamesComponent } from './exames/exames.component';
import { MatSortModule } from '@angular/material/sort';
import { MatExpansionModule } from '@angular/material/expansion';


@NgModule({
  declarations: [
    ExamesComponent
  ],
  imports: [
    CommonModule,
    IncidenciasRoutingModule,
    MatSortModule,
    MatCardModule,
    HttpClientModule,
    MatExpansionModule
  ]
})
export class ExamesModule { }
