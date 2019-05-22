import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { JhiLanguageService } from 'ng-jhipster';
import { JhiLanguageHelper } from 'app/core';
import { JHipster6Java11TestSharedModule } from 'app/shared';
/* jhipster-needle-add-admin-module-import - JHipster will add admin modules imports here */

import {
  adminState,
  AuditsComponent,
  UserMgmtComponent,
  UserMgmtDetailComponent,
  UserMgmtUpdateComponent,
  UserMgmtDeleteDialogComponent,
  LogsComponent,
  BpfMetricsMonitoringComponent,
  BpfHealthModalComponent,
  BpfHealthCheckComponent,
  BpfConfigurationComponent,
  BpfDocsComponent,
  BpfTrackerComponent
} from './';

@NgModule({
  imports: [
    JHipster6Java11TestSharedModule,
    /* jhipster-needle-add-admin-module - JHipster will add admin modules here */
    RouterModule.forChild(adminState)
  ],
  declarations: [
    AuditsComponent,
    UserMgmtComponent,
    UserMgmtDetailComponent,
    UserMgmtUpdateComponent,
    UserMgmtDeleteDialogComponent,
    LogsComponent,
    BpfConfigurationComponent,
    BpfHealthCheckComponent,
    BpfHealthModalComponent,
    BpfDocsComponent,
    BpfTrackerComponent,
    BpfMetricsMonitoringComponent
  ],
  providers: [{ provide: JhiLanguageService, useClass: JhiLanguageService }],
  entryComponents: [UserMgmtDeleteDialogComponent, BpfHealthModalComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JHipster6Java11TestAdminModule {
  constructor(private languageService: JhiLanguageService, private languageHelper: JhiLanguageHelper) {
    this.languageHelper.language.subscribe((languageKey: string) => {
      if (languageKey !== undefined) {
        this.languageService.changeLanguage(languageKey);
      }
    });
  }
}
